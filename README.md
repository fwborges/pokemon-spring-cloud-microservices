# pokemon-battle-type-compare-spring-cloud-microservices

Learning spring cloud

This project was implemented with Spring Eureka, Ribbon Client, Feign Client, Zuul Api Gateway,Spring Sleuth and Hystrix. All of them are simple implementations.

To run, execute the sh files:

* 1-eureka.sh
* 2-poke-type-service.sh
* 3-poke-battle-compare.sh
* 4-zuul-api-gateway.sh

# Available endpoints:

* http://localhost:{port}/battle/{typeOne}/versus/{typeTwo} (pokemon-type-battle-compare-service)
* http://localhost:8000/type/{type} (pokemon-type-service)
* http://localhost:8765/poke-type-battle-compare/battle/grass/versus/water (Zuul)

# Available types:
* <span style="color:blue">Water</span>
* Grass
* Fire
* Other input will be throws an RunTimeException and Hystrix will execute fallback.
