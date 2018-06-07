package com.firebaseuser.map;

import java.util.List;

class LegsObject {
    private List steps;

    private DistanceObject distance;

    private DurationObject duration;

    public LegsObject(DurationObject duration, DistanceObject distance, List steps) {
        this.duration = duration;
        this.distance = distance;
        this.steps = steps;
    }

    public List getSteps() {
        return steps;
    }

    public DistanceObject getDistance() {
        return distance;
    }

    public DurationObject getDuration() {
        return duration;
    }
}
