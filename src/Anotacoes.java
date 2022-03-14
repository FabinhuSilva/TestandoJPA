
public class Anotacoes {
    
    /*
    
    JPA JPA JPA JPA JPA JPA JPA JPA JPA JPA JPA JPA JPA JPA JPA JPA
    -> https://stackoverflow.com/questions/16572039/connecting-postgresql-9-2-1-with-hibernate
    -> https://javabydeveloper.com/what-is-dialect-in-hibernate-and-list-of-dialects/
    
    
  <?xml version='1.0' encoding='utf-8'?>

<!--
  ~ Hibernate, Relational Persistence for Idiomatic Java
  ~
  ~ License: GNU Lesser General Public License (LGPL), version 2.1 or later.
  ~ See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
  -->
<!DOCTYPE hibernate-configuration SYSTEM
        "http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">
<hibernate-configuration
>
    <session-factory>
        <!-- Database connection settings -->
        <property name="connection.driver_class">org.postgresql.Driver</property>
        <property name="connection.url">jdbc:postgresql://localhost:5433/hibernatedb</property>
        <property name="connection.username">postgres</property>
        <property name="connection.password">password</property>

        <!-- JDBC connection pool (use the built-in) -->
        <property name="connection.pool_size">1</property>

        <!-- SQL dialect -->
        <property name="hibernate.dialect">org.hibernate.dialect.PostgreSQLDialect</property>

        <!-- Enable Hibernate's automatic session context management -->
        <property name="current_session_context_class">thread</property>

        <!-- Disable the second-level cache  -->
        <property name="cache.provider_class">org.hibernate.cache.internal.NoCacheProvider</property>

        <!-- Echo all executed SQL to stdout -->
        <property name="show_sql">true</property>

        <!-- Drop and re-create the database schema on startup -->
        <property name="hbm2ddl.auto">create</property>
        <mapping class="com.waseem.UserDetails"/>
    </session-factory>
</hibernate-configuration>
    
    */
    
}
