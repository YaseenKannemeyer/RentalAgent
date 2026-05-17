package za.ac.cput.rentalagent.domain;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rental_agents")
public class RentalAgent {
    @Embedded
    private Name name;
    
    @Id
    private String email;
    
    private String mobileNumber;

    protected RentalAgent() {
    }
    
    private RentalAgent(Builder builder){
        this.name = builder.name;
        this.email=builder.email;
        this.mobileNumber=builder.mobileNumber;
    }

    public Name getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    @Override
    public String toString() {
        return "RentalAgent{" +
                "name=" + name +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
    
    public static class Builder{
        private Name name;
        private String email;
        private String mobileNumber;

        public Builder setName(Name name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public Builder copy(RentalAgent rentalAgent){
            this.name = rentalAgent.name;
            this.email = rentalAgent.email;
            this.mobileNumber = rentalAgent.mobileNumber;
            return this;
        }

        public RentalAgent build(){
            return new RentalAgent(this);
        }
    }
}
