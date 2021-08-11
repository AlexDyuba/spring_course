# Terms
Bean - it is nothing more than the most common object. The only difference is that beans are usually called those objects that are managed by Spring and live inside its DI container.
# Annotation
@Component - is an annotation that allows Spring to automatically detect our custom beans.

@Autowired - The Spring framework enables automatic dependency injection. In other words, by declaring all the bean dependencies in a Spring configuration file, Spring container can autowire relationships between collaborating beans. This is called Spring bean autowiring.

@Qualifier - by using the @Qualifier annotation, we can eliminate the issue of which bean needs to be injected.
