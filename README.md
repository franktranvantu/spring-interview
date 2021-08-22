## HTTP
- What is different among POST, PUT and PATCH

## Spring core
- What
  - What is ioc
  - What is dependency injection
  - What is aop (cross cutting concerns)
  - What are the RestClients you have used in your project
    - getForEntity()
      - Returns ResponseEntity includes status code, body, headers
    - getForObject()
      - Only returns a sample object
- List
  - Which the most core components of Spring
- Comparison
  - What is different between @Bean and @Component
  - What is difference between @Component vs @Service vs @Repository
  - What is different between Singleton pattern and Singleton bean scope
  - Singleton scope bean vs Singleton design pattern
  - Singleton vs Prototype scope
- What will happen
  - What will happen if there is more than one bean of a type
  - What will happen if you use @Service over a DAO
    - Any exception will be thrown by your persistence layer (spring jdbc, hibernate, mybatis or whatever do not master), Spring will wrap that up with its own exception call DataAccessException
  - Where should "@Transactional" be place Service Layer or DAO
- Explain
  - Spring bean life cycle
    - Constructor
    - @PostConstruct
    - @PreDestroy
    - Open example code
    - When bean will be destroyed in stand alone app and web app (ContextLoaderListener)

## Spring jdbc

## Spring data jpa
- What is different between native query and JPQL
- What is different among JpaRepository, PagingAndSortingRepository, CrudRepository
- @JoinTable, @JoinColumn, @Embeddable, Embedded

## Spring web
- Advantages of using ResponseEntity
  - You can send status code like OK, Bad request... and headers
- What is Delete api status code you will handle
  - 204 - No content
  - 200 - OK
- Why is it important to handle request timeout
  - When connecting to the server then it will create a thread
  - If a thread is not release and it will be blocked
  - Then another request is comming then will be blocked, again and again
- Can we have many threads inside the server (tomcat, jboss, jetty)
- What is difference between read timeout and server timeout
- What is content negotiation
  - Consumes
  - Produces
- How will you create custom validator
- How do you create annotation in java

## Spring security
- How does Basic Authentication work in Rest API
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
- Should you use JWT or Session-based authentication in the microservices
  - Rest should be stateless
  - First request go to first service but second request go to second service, so we have to re-authenticate
- What is bearer token
  - Bearer means you are the owner of the token, not for validation
- Jwt uses for authentication or authorization
  - Authorization because it is done when you are authenticated
 
## Spring boot
- How to switch web server from tomcat to jetty

## Database
- Given a table people(first_name, last_name), first_nanme and last_name are indexed. How is performance of those queries:
  - SELECT * FROM people WHERE first_name = 'Frank' AND last_name = 'Tran'
  - SELECT * FROM people WHERE first_name = 'Frank'
  - SELECT * FROM people WHERE last_name = 'Tran'
- Assum that we have 1M records, we only want to index on records that the status is active. What should we do
- Structure of index
  - Search key
  - Data reference
- Why indexed column must be not null
- How to insert 1 million record into database

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
