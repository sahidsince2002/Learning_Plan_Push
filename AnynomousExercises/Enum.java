enum Alert {
    INFO, WARNING, MAJOR, CRITICAL;
}

class Enum {
    public static void main(String []args){
        Alert at = Alert.INFO;
        

        switch(at){
            case INFO:  System.out.println("No major issues ");
            break;

            case WARNING:  System.out.println("Issue occured ");
            break;

            case MAJOR:  System.out.println("Immediate attention needed ");
            break;

            case CRITICAL:  System.out.println("!! System crash ");
            break;

        }

      
    }
}