package agwttemplatepackage.shared;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ExampleServiceAsync {
  void checkServer(AsyncCallback<Void> callback);
}
