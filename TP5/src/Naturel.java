import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1e5a921b-e8e3-428a-9d64-99bc961ba88f")
public class Naturel {
    @objid ("c31dc9bd-6c25-45d6-9601-fe86ec9952c9")
    private Cellule tete;

    @objid ("49be1dc3-40fd-4210-903f-63fd3bdfe20d")
    public Naturel() {
    }

    @objid ("fac3a7ec-eefc-4716-8fb6-d656f8f5f654")
    private class Cellule {
        @objid ("1f52ddbe-6966-4aa3-9496-5c3c13bb3f7c")
        private String valeur;

        @objid ("88530bb1-4864-41c1-bb9e-c411199e6282")
        public Cellule cellule;

        @objid ("6dea5ab2-ce03-4cad-9fe3-1810f8255cd0")
        public Cellule() {
        }

        @objid ("bee9abe3-9e81-4762-96ff-1bc29262a821")
        String getValeur() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return this.valeur;
        }

        @objid ("adae4509-7ba5-416a-8be3-526a2aecddc0")
        void setValeur(String value) {
            // Automatically generated method. Please delete this comment before entering specific code.
            this.valeur = value;
        }

    }

}
