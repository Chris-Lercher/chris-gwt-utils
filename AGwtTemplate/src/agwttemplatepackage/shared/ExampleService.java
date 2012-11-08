package agwttemplatepackage.shared;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("example")
public interface ExampleService extends RemoteService {
  String greetServer(final String name) throws IllegalArgumentException;
}
