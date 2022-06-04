<h1>Open Feign</h1>

<ul class="list-group">
    <li class="list-group-item">1. import the maven dependency spring-cloud-starter-openfeign</li>
    <br>
    <li class="list-group-item">2. create new interface in currencyExchange proxy in currency conversion, add @FeignClient(name="currency-exchange", url="localhost:8001")
    </li>
    <br>
    <li class="list-group-item">3. add @EnableFeignClients in currency conversion main file</li>
    <br>
    <li class="list-group-item">4. copy the controller class from the currency-exchange and put inside the proxy</li>
    <br>
    <li class="list-group-item">5. now autowire the interface in the currency-conversion and access the method</li>
    <br>
</ul>

<h1>Service Discovery</h1>

<ul class="list-group">
    <li class="list-group-item">1.create a service discovery project & import the maven dependency spring-cloud-starter-netflix-eureka-server</li>
    <br>
    <li class="list-group-item">2. add @EnableEurekaServer in the main file of the server file
    </li>
    <br>
    <li class="list-group-item">4. spring.application.name=naming-server, server.port=8761, eureka.client.register-with-eureka=false, eureka.client.fetch-registery=false</li>
    <br>
    <li class="list-group-item">5. check localhost:8761 on browser</li>
    <br>
    <li class="list-group-item">6. add spring-cloud-starter-netflix-eureka-client in the clients & annotate in </li>
    <br>
    <li class="list-group-item">7. check localhost:8761 on browser for namign server</li>
    <br>
    <li class="list-group-item">8. eureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka in all client servers</li>
    <br>
</ul>


<h1>Api gateway (spring cloud gateway)</h1>

<ul class="list-group">
    <li class="list-group-item">1.create a api-gateway project & import the maven dependency  spring cloud routing (gateway), eureka-client, dev-tools, actuator</li>
    <br>
    <li class="list-group-item">2. spring.application.name=api-gateway, server.port=8765, eureka.client... , spring.cloud.gateway.discovery.locator.enabled=TRUE, spring.cloud.gateway.discovery.locator.lowerCaseServiceId=true(lowercase the url)
    </li>
    <br>
    <li class="list-group-item">4. http://localhost:8765/CURRENCY-EXCHANGE/currency-exchange/...</li>
    <br>
    </ul>