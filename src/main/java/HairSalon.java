public class HairSalon {

    private String[] openingDays = {"Monday", "Tuesday"};

    // This method should return the openingDays array.
    public String[] getOpeningDays() {
        return this.openingDays;
    }

    // This method should return true if the weekday passed in is present in the openingDays array.
    // If not it should return false. If the String passed in does not end in the letters "day",
    // it should throw an IllegalArgumentException with a message explaining that only weekdays are valid.
    public boolean isOpen(String weekDay) {

        if(weekDay.length() < 3 || !weekDay.substring(weekDay.length() - 3).equals("day")) {
            throw new IllegalArgumentException("A week day must end with \"day\"");
        }

        for(int i = 0; i < this.openingDays.length; i++) {
            if(openingDays[i].equals(weekDay)) {
                return true;
            }
        }
        return false;
    }






}
