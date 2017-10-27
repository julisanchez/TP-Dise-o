package Datos;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(periodo.class)
public abstract class periodo_ {

	public static volatile SingularAttribute<periodo, Integer> idPeriodo;
	public static volatile SingularAttribute<periodo, Date> inicio;
	public static volatile SingularAttribute<periodo, Date> fin;
	public static volatile ListAttribute<periodo, en> ens;

}

