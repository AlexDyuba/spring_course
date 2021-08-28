# Terms/theory
Bean - it is nothing more than the most common object. The only difference is that beans are usually called those objects that are managed by Spring and live inside its DI container.

Joinpoint - is a point during the execution of a program, such as execution of a method or the handling of an exception.

In Spring AOP, 4 type of advices are supported :

- Before advice – Run before the method execution

- After returning advice – Run after the method returns a result

- After throwing advice – Run after the method throws an exception

- Around advice – Run around the method execution, combine all three advices above. 

# Annotation
@Component - is an annotation that allows Spring to automatically detect our custom beans.

@Autowired - the Spring framework enables automatic dependency injection. In other words, by declaring all the bean dependencies in a Spring configuration file, Spring container can autowire relationships between collaborating beans. This is called Spring bean autowiring.

@Qualifier - by using the @Qualifier annotation, we can eliminate the issue of which bean needs to be injected.

@Value - This annotation can be used for injecting values into fields in Spring-managed beans, and it can be applied at the field or constructor/method parameter level.

@Scope

two main 

- Singleton - when we define a bean with the singleton scope, the container creates a single instance of that bean; all requests for that bean name will return the same object, which is cached. Any modifications to the object will be reflected in all references to the bean. This scope is the default value if no other scope is specified.


- Prototype - a bean with the prototype scope will return a different instance every time it is requested from the container. It is defined by setting the value prototype to the @Scope annotation in the bean definition:

@PostConstruct - spring calls methods annotated with @PostConstruct only once, just after the initialization of bean properties.

@PreDestroy - a method annotated with @PreDestroy runs only once, just before Spring removes our bean from the application context.

- Note that both @PostConstruct and @PreDestroy annotations are part of Java EE. And since Java EE has been deprecated in Java 9 and removed in Java 11 we have to add an additional dependency to use these annotations:

@Configuration/@ComponentScan - we use the @ComponentScan annotation along with the @Configuration annotation to specify the packages that we want to be scanned. @ComponentScan without arguments tells Spring to scan the current package and all of its sub-packages.

@Bean - to declare a bean, simply annotate a method with the @Bean annotation. When JavaConfig encounters such a method, it will execute that method and register the return value as a bean within a BeanFactory.

@PropertySource - annotation providing a convenient and declarative mechanism for adding a PropertySource to Spring's Environment.

@Aspect - is a modularization of a concern that cuts across multiple classes. Unified logging can be an example of such cross-cutting concern

@Pointcut - is a predicate that helps match an Advice to be applied by an Aspect at a particular JoinPoint.
The Advice is often associated with a Pointcut expression and runs at any Joinpoint matched by the Pointcut.

@EnableAspectJAutoProxy - 

@Order - the @Order annotation defines the sorting order of an annotated component or bean.

@AfterReturning - 

@Around - 

# Hibernate

### Theory

Entity class - A JPA entity class is a POJO (Plain Old Java Object) class, i.e. an ordinary Java class that is marked (annotated) as having the ability to represent objects in the database. 

SessionFactory - SessionFactory is an interface. SessionFactory can be created by providing Configuration object, which will contain all DB related property details pulled from either hibernate.cfg.xml file or hibernate.properties file. SessionFactory is a factory for Session objects.

Session - Unlike SessionFactory, the Session object will be created on demand. Session is a lightweight object. Session provides a physical connectivity between your application and database. The Session will be established each time your application wants do something with database. Session object will be provided by SessionFactory object. All the persistent objects will be saved and retrieved through Session object. The session object must be destroyed after using it.

### Annotation

@Entity - a class which should be persisted in a database it must be annotated with javax.persistence.Entity. Such a class is called Entity. JPA uses a database table for every entity. Persisted instances of the class will be represented as one row in the table.
All entity classes must define a primary key, must have a non-arg constructor and or not allowed to be final. Keys can be a single field or a combination of fields.

@Table - with this annotation, we tell Hibernate which table to map this class to. The @Table annotation has various attributes with which we can specify the table name, directory, database, and the uniqueness of the columns in the database table.

@Column - the @Column annotation defines which column in the database table a particular class field belongs to (class attribute).

@Id - with the @Id annotation, we indicate the Primary Key of this class.

@GeneratedValue - this annotation is used in conjunction with the @Id annotation and defines parameters such as strategy and generator.

#### strategy

- GenerationType.AUTO - during a commit the AUTO strategy uses the global number generator to generate a primary key for every new entity object. These generated values are unique at the database level and are never recycled 

- GenerationType.IDENTITY - the IDENTITY strategy also generates an automatic value during commit for every new entity object. The difference is that a separate identity generator is managed per type hierarchy, so generated values are unique only per type hierarchy.
The same number generator is also used to generate numeric values for primary key fields annotated by @GeneratedValue with the AUTO strategy

- GenerationType.SEQUENCE  - unlike AUTO and IDENTITY, the SEQUENCE strategy generates an automatic value as soon as a new entity object is persisted (i.e. before commit). This may be useful when the primary key value is needed earlier. To minimize round trips to the database server, IDs are allocated in groups. The number of IDs in each allocation is specified by the allocationSize attribute. It is possible that some of the IDs in a given allocation will not be used. Therefore, this strategy does not guarantee there will be no gaps in sequence values.

- GenerationType.TABLE - the GenerationType.TABLE gets only rarely used nowadays. It simulates a sequence by storing and updating its current value in a database table which requires the use of pessimistic locks which put all transactions into a sequential order. This slows down your application, and you should, therefore, prefer the GenerationType.SEQUENCE, if your database supports sequences, which most popular databases do.

@OneToOne - 

- Uni-directional - 

- Bi-directional - 

#### cascade

- CascadeType.ALL - 

- CascadeType.DETACH - 

- CascadeType.MERGE - 

- CascadeType.PERSIST - 

- CascadeType.REMOVE - 

- CascadeType.REFRESH - 

@JoinColumn - 
 

