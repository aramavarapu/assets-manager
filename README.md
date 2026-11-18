# What went wrong with Cash?
1. Cash had no matching constructor. Every child class constructor has to call super, and Cash had no constructor to call super with.
2. Missing getValue() in Cash. The Asset class requires every child class to have a getValue() method. Since Cash is not abstract, it must provide its own version of getValue().

# My options:
## For the constructor
1. Give Cash a constructor that calls super.
2. Add a no-argument constructor to Asset. This would make the error go away, but it would let anyone create an asset with no description, date or cost and mess up the Cash asset.
## For the getValue()
1. Override getValue() in Cash and return the original cost.
2. Make Cash abstract too. This would remove the error, but then I could never create a Cash object.

## What I picked and why
I gave Cash a constructor that calls super and overrode getValue() to return getOriginalCost().
I picked these because they keep every Asset fully set up and still let me create a real Cash object. While the others weakened Asset or made Cash unusable.
```java
public class Cash extends Asset {
    public Cash(String description, String dateAcquired, BigDecimal originalCost) {
        super(description, dateAcquired, originalCost);
    }

    @Override
    public BigDecimal getValue() {
        return getOriginalCost();
    }
}
```
## Author
Anup Ramavarapu, Year Up Java Academy