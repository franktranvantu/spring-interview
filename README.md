## Java core
- What is platform independence
- Why is Java so popular
  - Object oriented
  - Platform independence
- Why string is immutable
- How HashMap works internally
- How get method of HashMap works internally
- Why the key of HashMap must be immutable
- How many exception types are there in Java
- Difference between String, String Builder, and String Buffer
- Difference between HashSet and TreeSet
- 

## OOP
- Why we need constructor inside an abstract class
- What is meant by Method Overriding
- What is meant by Overloading

## Java 8
- What is functional interface
- Example
```
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
  numbers
      .stream()
      .filter(number -> {
          System.out.println(number);
          return true;
      })
  ```

## HTTP
- What is different among POST, PUT and PATCH

## Spring core
- Which the most core components of Spring
- What is ioc
- What is dependency injection
- What is aop
- Singleton vs Prototype scope
- Singleton scope bean vs Singleton design pattern
- Prototype vs Request scope
- What happens if there is more than one bean of a type
- What is different between @Bean and @Component
- What is different between Singleton pattern and Singleton bean scope
- Where should "@Transactional" be place Service Layer or DAO
- Can you use @service over a DAO
- How to insert 1 million record into database

## Spring jdbc

## Spring mvc

## Spring security
- How spring security works
- How many filters are there in spring security
  - SecurityContextPersistenceFilter
  - HeaderWriterFilter
  - CsrfFilter
  - LougoutFilter
  - UsernamePasswordAuthenticationFilter: Tries to find a username/password request parameter/POST body and if found, tries to authenticate the user with those values.
  - DefaultLoginPageGeneratingFilter: Generates a login page for you, if you don’t explicitly disable that feature. THIS filter is why you get a default login page when enabling Spring Security.
  - DefaultLogoutPageGeneratingFilter: Generates a logout page for you, if you don’t explicitly disable that feature.
  - BasicAuthenticationFilter: Tries to find a Basic Auth HTTP Header on the request and if found, tries to authenticate the user with the header’s username and password.
  - RequestCacheAwareFilter
  - SecurityContextHolderAwareRequestFilter
  - AnonymousAuthenticationFilter
  - SessionManagementFilter
  - ExceptionTranslationFilter
  - FilterSecurityInterceptor: Does your authorization.
## Spring boot
- How to switch web server from tomcat to jetty

## Maven
- Build life cycle
  - validate
  - compile
  - test
  - package
  - integration test
  - verify
  - install
  - deploy
- Transitive dependency
