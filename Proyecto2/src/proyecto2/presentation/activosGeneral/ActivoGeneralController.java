/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.presentation.activosGeneral;

import java.awt.Point;
import java.text.ParseException;
import java.util.List;
import org.hibernate.Session;
import proyecto2.SessionUsuario;
import proyecto2.logic.Activo;
import proyecto2.logic.Solicitud;
import proyecto2.logic.Usuario;
import proyecto2.presentation.administrador.listado.AdministradorSolicitudModel;
import proyecto2.presentation.administrador.listado.AdministradorSolicitudView;

/**
 *
 * @author Rodrigo Meléndez
 */
public class ActivoGeneralController {
    
    Session session;
    ActivoGeneralView view;
    ActivoGeneralModel model;
    SessionUsuario sessionUsu;
    
    public ActivoGeneralController(ActivoGeneralView view, ActivoGeneralModel model, Session session, SessionUsuario sessionUsu) {
        this.session = session;
        this.view = view;
        this.model = model;
        this.sessionUsu = sessionUsu;
        view.setController(this);
        view.setModel(model);
    }
    
//    public void buscar(String filter) throws Exception {       
//        //model.setFilter(filter);
//        this.refrescarBusqueda();
//    }
    
    public void refrescarBusqueda(String string) throws Exception {
       List<Activo> rows = null;
       if(model.getStatus() == 0)
        rows = proyecto2.logic.ModelGeneral.instance().searchActivosFromCodigo(string);
       if(model.getStatus() == 1)
        rows = proyecto2.logic.ModelGeneral.instance().searchActivosFromCategoria(string);
       if(model.getStatus() == 2)
        rows = proyecto2.logic.ModelGeneral.instance().searchActivosFromDescripcion(string);
       if(model.getStatus() == 3)
        rows = proyecto2.logic.ModelGeneral.instance().searchActivosFromDependencia2(string);
       if(model.getStatus() == 4)
        rows = proyecto2.logic.ModelGeneral.instance().searchActivosFromFuncionario(string);          
       model.setActivos(rows);
       model.commit();
       if (rows.isEmpty()) throw new Exception("Ningún dato coincide");
    }

    public void buscarFromActivo() throws Exception {
        this.refrescarTable();
    }
    
    private void refrescarTable() throws Exception {
       Usuario usuario = (Usuario) sessionUsu.getAttribute("User");
       //String nombre = proyecto2.logic.ModelGeneral.instance().getCodigoDependenciaDesdeLabor(usuario.getFuncionario().getId());
       String puesto = proyecto2.logic.ModelGeneral.instance().getPuestoDeLaborFromActivo(usuario.getFuncionario().getId());
       model.setRol(puesto);
       List<Activo> rows = null;
       if("Jefe de OCCB".equals(puesto)){
           model.setRol("Jefe de OCCB");
           rows = proyecto2.logic.ModelGeneral.instance().searchAllActivo();
       }
       if("Administrador".equals(puesto)){
           model.setRol("Administrador");
           String codigo = proyecto2.logic.ModelGeneral.instance().getCodigoDependenciaDesdeLabor(usuario.getFuncionario().getId());
           rows = proyecto2.logic.ModelGeneral.instance().searchActivosFromDependencia(codigo);
       }
       model.setActivos(rows);
       model.commit();
       if (rows.isEmpty()) throw new Exception("Ningún dato coincide");
    }

    public void reset(){
        model.reset();
    }
    
    public void show(){
        view.setVisible(true);
    }

    public void show(Point position){
        view.setLocation(position);
        this.show();
    }   
    
    public void hide(){
        view.setVisible(false);
    }

    public ActivoGeneralView getView() {
        return view;
    }

    Activo getSeleccionada(int row) {
        return model.getActivos().getRowAt(row); 
    }
}
