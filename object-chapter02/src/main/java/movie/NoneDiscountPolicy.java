package movie;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAMount(Screening screening) {
        return Money.ZERO;
    }
}
