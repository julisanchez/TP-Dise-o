package Datos;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(usuario.class)
public abstract class usuario_ {

	public static volatile ListAttribute<usuario, password> passwords;
	public static volatile SingularAttribute<usuario, Integer> idUsuario;
	public static volatile SingularAttribute<usuario, String> username;

}

