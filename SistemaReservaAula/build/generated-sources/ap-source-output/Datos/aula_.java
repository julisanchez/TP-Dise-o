package Datos;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(aula.class)
public abstract class aula_ {

	public static volatile SingularAttribute<aula, Integer> piso;
	public static volatile SingularAttribute<aula, Boolean> estado;
	public static volatile SingularAttribute<aula, Boolean> ac;
	public static volatile SingularAttribute<aula, String> pizarron;
	public static volatile SingularAttribute<aula, Integer> num;
	public static volatile SingularAttribute<aula, Integer> idAula;
	public static volatile ListAttribute<aula, en> ens;
	public static volatile SingularAttribute<aula, Integer> capacidad;

}

