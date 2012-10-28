package agwttemplatepackage.server;

import agwttemplatepackage.client.ExampleService;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

@SuppressWarnings("serial")
public class ExampleServiceImpl extends RemoteServiceServlet implements ExampleService {

  @Override
  public String greetServer(final String input) throws IllegalArgumentException {
    return "Server received " + input;
  }
}
