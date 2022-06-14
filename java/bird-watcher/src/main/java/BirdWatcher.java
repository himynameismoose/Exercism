class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        if (birdsPerDay.length == 0) {
            return 0;
        } else {
            return birdsPerDay[birdsPerDay.length-1];
        }
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] = getToday() + 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] == 0) {
                return true;
            }
        }

        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int totalBirds = 0;

        if (numberOfDays > birdsPerDay.length) {
            for (int i = 0; i < birdsPerDay.length; i++) {
                totalBirds += birdsPerDay[i];
            }
        } else {
            for (int i = 0; i < numberOfDays; i++) {
                totalBirds += birdsPerDay[i];
            }
        }

        return totalBirds;
    }

    public int getBusyDays() {
        int days = 0;

        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] >= 5) {
                days++;
            }
        }

        return days;
    }
}
