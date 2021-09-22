import java.util.LinkedList;

class BrowserHistory {
    LinkedList<String> history ;
    int pt=0 ;
    public BrowserHistory(String homepage) {
        history = new LinkedList<>();
        history.add(homepage);

    }

    public void visit(String url) {
        if ((pt+1 )==history.size()){//no elements after it
            pt++;
            history.add(url);
        }else if ((pt+1) < history.size()){
            int s=history.size();
            for (int i=pt+1 ; i<s ; i++){
                history.removeLast();
            }
            history.add(url);
            pt++;
        }

    }

    public String back(int steps) {
        if (pt-steps  <0){
            pt=0;
        }else{
            pt-=steps;
        }
        return history.get(pt);

    }

    public String forward(int steps) {
        if (pt+steps >= history.size()){
            pt=history.size()-1;
        }else{
            pt+=steps;
        }
        return history.get(pt);
    }


}
