<b>Important Annotations</b>:

01) <b>@Configuration</b> is the most important annotation to identify the class as a configuration class. This class should contain the beans details that should be wired in the application.

02) <b>@Bean</b> annotation is used to declare a bean. We have to write a method that creates an instance of the required type and annotate it with @Bean. The @Bean annotation tells Spring that the method will return an object that should
be registered as a bean in the Spring application context. The body of the method contains logic that ultimately results in the creation of the bean instance.

03) <b>@ConstructorProperties</b>: If somebody doesn’t want to keep the debug information in .class file and still want to use Spring constructor-injection using parameter names, @ConstructorProperties annotation comes to rescue. 