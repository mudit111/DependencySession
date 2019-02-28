import javax.inject.Inject;

public class MyApplication {

    private MessageService service;

    @Inject
    public void setService(MessageService svc){
        this.service=svc;
    }

    public boolean sendMessage(String msg, String rec){
        return service.sendMessage(msg, rec);
    }
}