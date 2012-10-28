package agwttemplatepackage.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ExampleServiceAsync {
  void greetServer(final String input, final AsyncCallback<String> callback) throws IllegalArgumentException;
}
