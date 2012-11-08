package agwttemplatepackage.client;

import agwttemplatepackage.shared.ExampleService;
import agwttemplatepackage.shared.ExampleServiceAsync;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class AGwtTemplateEntry implements EntryPoint {
  private final ExampleServiceAsync exampleService = GWT.create(ExampleService.class);

  @Override
  public void onModuleLoad() {
    
    
    RootPanel.get().add(new Label("CLIENT OK"));
    
    exampleService.greetServer("TEMPLATE", new AsyncCallback<String>() {
      
      @Override
      public void onSuccess(final String result) {
        RootPanel.get().add(new Label("SERVER OK"));
      }
      
      @Override
      public void onFailure(final Throwable caught) {
        RootPanel.get().add(new Label("SERVER ERROR: " + caught.getClass().getName()));
      }
    });
    
    
  }
}
