class SpaceAge {
    private double ageInSeconds;
    private double earthYearInSeconds = 31557600;
    SpaceAge(double seconds) {
        if (seconds < 0)
            throw new IllegalArgumentException("That's impossible!");
        ageInSeconds = seconds;
    }

    double getSeconds() {
        return ageInSeconds;
    }

    double onEarth() {
        return ageInSeconds / earthYearInSeconds;
    }

    double onMercury() {
        return onEarth() / Planets.MERCURY.getOrbitalRateInEarth();
    }

    double onVenus() {
        return onEarth() / Planets.VENUS.getOrbitalRateInEarth();
    }

    double onMars() {
        return onEarth() / Planets.MARS.getOrbitalRateInEarth();
    }

    double onJupiter() {
        return onEarth() / Planets.JUPITER.getOrbitalRateInEarth();
    }

    double onSaturn() {
        return onEarth() / Planets.SATURN.getOrbitalRateInEarth();
    }

    double onUranus() {
        return onEarth() / Planets.URANUS.getOrbitalRateInEarth();
    }

    double onNeptune() {
        return onEarth() / Planets.NEPTUNE.getOrbitalRateInEarth();
    }

    private enum Planets {
        EARTH(1), MERCURY(.2408467), VENUS(.61519726), MARS(1.8808158), JUPITER(11.862615),
        SATURN(29.447498), URANUS(84.016846), NEPTUNE(164.79132);

        private double orbitalRateInEarth;

        Planets(double orbitalRateInEarth) {
            this.orbitalRateInEarth = orbitalRateInEarth;
        }

        public double getOrbitalRateInEarth() {
            return orbitalRateInEarth;
        }
    }
}
