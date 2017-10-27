package Datos;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(en.class)
public abstract class en_ {

	public static volatile SingularAttribute<en, String> fecha;
	public static volatile SingularAttribute<en, String> tipo;
	public static volatile SingularAttribute<en, Date> horario;
	public static volatile SingularAttribute<en, aula> idAula;
	public static volatile SingularAttribute<en, periodo> idPeriodo;
	public static volatile SingularAttribute<en, Date> duracion;
	public static volatile SingularAttribute<en, reserva> idReserva;

}

