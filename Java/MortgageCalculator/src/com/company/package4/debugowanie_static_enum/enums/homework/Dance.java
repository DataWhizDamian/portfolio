package com.company.package4.debugowanie_static_enum.enums.homework;

import java.util.Arrays;

public enum Dance {
    HIPHOP(new String[]{"12:00","13:30"}, new Day[]{Day.MONDAY, Day.SUNDAY}) {
        @Override
        public Dance getAlternative() {
            return BALET;
        }
    },
    JAZZ(new String[]{"14:00","15:00"}, new Day[]{Day.FRIDAY, Day.THURSDAY}) {
        @Override
        public Dance getAlternative() {
            return SWING;
        }
    },
    SEKS(new String[]{"23:00", "23:30"}, new Day[]{Day.FRIDAY, Day.SATURDAY}){
        @Override
        public Dance getAlternative() {
            return BALET;
        }
    },
    SWING(new String[]{"10:00", "11:00"}, new Day[]{Day.MONDAY, Day.WEDNESDAY}) {
        @Override
        public Dance getAlternative() {
            return HIPHOP;
        }
    },
    BALET(new String[]{"08:00", "09:00"}, new Day[]{Day.WEDNESDAY, Day.TUESDAY}) {
        @Override
        public Dance getAlternative() {
            return SWING;
        }
    };


    private final String[] hours;
    private final Day[] days;

    Dance(String[] hours, Day[] days) {
        this.hours = hours;
        this.days = days;
    }

    public String getHours() {
        return Arrays.toString(hours);
    }

    public String getDays() {
        return Arrays.toString(days);
    }

    public abstract Dance getAlternative();

}
