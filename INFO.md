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
