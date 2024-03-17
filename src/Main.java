public class Main {
    public static void main(String[] args) {
        Signature NatsevichKristina = new Signature ("by Kristina Natsevich", "blue", "Times New Roman");
        Watermark watermarkDefault = new Watermark ("by Kristina Natsevich", "8");
        Files MyFile1 = new Files ("My File!", "It's my homework", NatsevichKristina,watermarkDefault);

    }
}
