package edu.upc.dsa;

import edu.upc.dsa.models.Evento;
import edu.upc.dsa.models.GameObject;
import edu.upc.dsa.models.Objects;
import edu.upc.dsa.models.User;

import java.util.List;

public interface GameManager {

    User LogIn(String username, String password) throws Exception;

    User Register(String username, String password, String email) throws Exception;

    Object addNewObjeto(String nombre, String descripcion, Objects tipo, int precio);

    User purchaseObject(String username, String objectId) throws Exception;

    List<GameObject> getListObjects(String username);

    User addObjectToUser(String username, String objectId);

    String getObjectId(String objectName);

    List<GameObject> getAllStoreObjects();

    int getNumberOfUsersRegistered();

    User getUser(String username);

    List<Evento> getEventos();

    boolean registerEvento(String userId, String eventoId);
}
