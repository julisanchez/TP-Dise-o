package Datos;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(docente.class)
public abstract class docente_ {

	public static volatile ListAttribute<docente, reserva> reservas;
	public static volatile SingularAttribute<docente, String> apellido;
	public static volatile SingularAttribute<docente, Integer> idDocente;
	public static volatile SingularAttribute<docente, String> nombre;
	public static volatile SingularAttribute<docente, String> email;

}

