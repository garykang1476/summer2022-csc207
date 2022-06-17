package week4.lsp;

public class MutedDog extends Animal {

    @Override
    void make_noise() {
        throw new RuntimeException("I cannot make noise");
    }
}
