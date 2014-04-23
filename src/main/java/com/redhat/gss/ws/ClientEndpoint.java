package com.redhat.gss.ws;

import org.jboss.logging.Logger;

/**
 * Because this is a CXF endpoint, any client buses created within the
 * endpoint's invocation will be cleaned up by CXF after the endpoint method has
 * returned.  Therefore it will not exhibit the same memory issues seen if
 * <code>ClientServlet</code> was invoked instead.
 */
@javax.jws.WebService
public class ClientEndpoint
{
  private static Logger log = Logger.getLogger(ClientEndpoint.class);

  public void invokeBigHello() throws Exception
  {
    Client.invokeClient(false);
  }
}
