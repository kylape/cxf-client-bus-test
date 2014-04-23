#JBossWS/CXF Client Tests

This example demonstrates how JBossWS/CXF clients behave and how to configure
them to behave according to your needs.

##Options
`test.sh` will use `curl` to invoke a client servlet, which will then invoke a
SOAP endpoint.  The script will concurrently invoke the servlet 30 times,
causing 30 threads to be spawned by JBossWeb to handle all the requests.  There
are two options that can be added to the URL passed to `curl`:

- `?shared`: Clients will share one `Service` object, but each thread will
  create its own proxy/port.
- `?useTcclStrategy`: This will cause any `Service` object created duing this
  particular invocation to be created with the `UseTCCLBusFeature`, as described [here](https://docs.jboss.org/author/display/JBWS/Apache+CXF+integration#ApacheCXFintegration-BusselectionstrategiesforJAXWSclients).

**WARNING**: If you do not use either of the above options, *expect your JBoss server to run out of memory*.
