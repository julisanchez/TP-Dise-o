package Datos;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(bedel.class)
public abstract class bedel_ extends Datos.usuario_ {

	public static volatile ListAttribute<bedel, reserva> reservas;
	public static volatile SingularAttribute<bedel, String> apellido;
	public static volatile SingularAttribute<bedel, String> turno;
	public static volatile SingularAttribute<bedel, String> nombre;
	public static volatile SingularAttribute<bedel, Boolean> activo;

}

