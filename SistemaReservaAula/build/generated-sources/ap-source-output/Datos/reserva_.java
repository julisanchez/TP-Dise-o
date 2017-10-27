package Datos;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(reserva.class)
public abstract class reserva_ {

	public static volatile SingularAttribute<reserva, Integer> cantidadAlumnos;
	public static volatile SingularAttribute<reserva, docente> docente;
	public static volatile ListAttribute<reserva, en> ens;
	public static volatile SingularAttribute<reserva, bedel> bedel;
	public static volatile SingularAttribute<reserva, Integer> idReserva;
	public static volatile SingularAttribute<reserva, clase> clase;

}

