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

    <hr>
</ul>