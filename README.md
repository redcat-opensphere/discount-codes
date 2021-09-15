# Discount Codes Microservices challenge with Quarkus and Red Hat Data Grid

You will be provided with a Quarkus application which exposes a REST API to create and use Discount Codes. Discount codes have a name, an enterprise name, a value and a type.
Types are PERCENT or VALUE. For example:

PROMO12, SEPHORA, 20, PERCENT (20% discount in Sephora)
D1876, ZARA, 10, VALUE (10 euros of discount in Zara)

Implement the REST API that puts the values in the cache.
Implement the REST API that given the type discount code (PERCENT or VALUE) displays the list of discount codes available.

For simplicity, let’s assume that this API won’t be called concurrently.

## Bonus track 1
Change the discount code creation REST endpoint to add a parameter that will make discount codes expire and be removed from the system after the given number of seconds. The existing REST API will get a new numeric parameter in seconds.

## Bonus track 2
Change the discount code consumer REST API to count how many PERCENT or VALUE codes have been used globally. Modify the discount code list REST endpoint to include that numeric value in the payload.

PROMO12, 315, SEPHORA, 20, PERCENT (20% discount in Sephora used 315 times)
D1876, 55, ZARA, 10, VALUE (10 euros of discount in Zara used 55 times)

## Bonus track 3
If the service needs to be called concurrently, which ideas would you have to make it possible and avoid race conditions?

## Start the Infinispan server

You have two options:

**Option 1:** Running with Docker `docker run -it -p 11222:11222 -e USER="admin" -e PASS="password" infinispan/server:latest`

There is a known issue between Docker For Mac and Infinispan Client integration. Explanations can be found in
[this blog post](https://blog.infinispan.org/2018/03/accessing-infinispan-inside-docker-for.html).
You **won't need to do this in production**, but for Docker for Mac users we have to configure the following
property in the file `src/main/resources/META-INF/resources/hotrod-client.properties`: `quarkus.infinispan-client.client-intelligence=BASIC`

**Option 2:** Download the server (12.x) from https://www.infinispan.org/ and run `./bin/server.sh`.

Infinispan Server listens in `localhost:8080` for REST endpoints.

To avoid conflicts, the quickstart configures another HTTP port in the [configuration file](/src/main/resources/application.properties)
with the following property:

```
quarkus.http.port=8081
```

If you use an older version of Infinispan or ``Red Hat Data Grid``, you might need to:

- Create a file called `hotrod-client.properties` under `src/main/resources/META-INF/`
- Configure the following property: `infinispan.client.hotrod.protocol_version=2.5`

## Useful links
TBD
