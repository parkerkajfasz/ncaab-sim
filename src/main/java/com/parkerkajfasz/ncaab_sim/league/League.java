package com.parkerkajfasz.ncaab_sim.league;

import com.parkerkajfasz.ncaab_sim.conference.Conference;
import java.util.ArrayList;

public class League {
    private ArrayList<Conference> conferences;

    public League(ArrayList <Conference> conferences) {
        this.conferences = conferences;
    }

    public ArrayList<Conference> getConferences() {
        return this.conferences;
    }

    public void setConferences(ArrayList<Conference> conferences) {
        this.conferences = conferences;
    }
}
