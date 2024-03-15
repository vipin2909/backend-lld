package prototype.scalerExercise;

import java.util.HashMap;

public class InvoicePrototypeRegistryImpl implements InvoicePrototypeRegistry {

    HashMap<InvoiceType, Invoice> hashMap = new HashMap<>();
    @Override
    public void addPrototype(Invoice invoice) {
        hashMap.put(invoice.getType(), invoice);
    }

    @Override
    public Invoice getPrototype(InvoiceType type) {
        return hashMap.get(type);
    }

    @Override
    public Invoice clone(InvoiceType type) {
        return hashMap.get(type).clone();
    }
}
