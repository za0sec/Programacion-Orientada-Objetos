package Tps.Tp7.Ej9;

import java.util.*;

public class HelpDesk {

    public static class HelpTicket{

        private String from;
        private String question;

        public HelpTicket(String from, String question){
            this.from = from;
            this.question = question;
        }

        @Override
        public String toString() {
            return String.format("HelpTicket for %s asking %s", from, question);
        }
    }

    private HelpTicket actualTicket;

    Map<ClientType, ArrayList<HelpTicket>> myMap = new HashMap<>();

    public HelpDesk openTicket(ClientType type, String from, String question){
        myMap.putIfAbsent(type, new ArrayList<>());
        myMap.get(type).add(new HelpTicket(from, question));
        return this;
    }

    public HelpTicket getNextTicket(ClientType type){
        Iterator<HelpTicket> iterator = myMap.get(type).iterator();
        if(!iterator.hasNext()){
            throw new NoSuchElementException();
        }
        actualTicket = iterator.next();
        iterator.remove();
        return actualTicket;
    }

    public HelpTicket getNextTicket() {

        for (Map.Entry<ClientType, ArrayList<HelpTicket>> entry : myMap.entrySet()) {
            ArrayList<HelpTicket> tickets = entry.getValue();
            Iterator<HelpTicket> iterator = tickets.iterator();

            if (iterator.hasNext()) {
                actualTicket = iterator.next();
                iterator.remove();
                return actualTicket;
            }
        }

        return actualTicket;

    }


    public boolean hasTickets() {
        for (ArrayList<HelpTicket> ticketList : myMap.values()) {
            if (!ticketList.isEmpty()) {
                return true;
            }
        }
        return false;
    }


}
