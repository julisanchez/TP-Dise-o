package Datos;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(password.class)
public abstract class password_ {

	public static volatile SingularAttribute<password, String> codigo;
	public static volatile SingularAttribute<password, Integer> idPassword;
	public static volatile SingularAttribute<password, LocalDateTime> fechaCreacion;
	public static volatile SingularAttribute<password, usuario> usuario;

}

