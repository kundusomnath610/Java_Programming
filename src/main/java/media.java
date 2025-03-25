public interface media {
    // Abstaract Method
    void play();
    void stop();

    default void pause() {
        System.out.println("PlayBack Paused");
    }

    static void resetAll() {
        System.out.println("Reset all thing");
    }
}

