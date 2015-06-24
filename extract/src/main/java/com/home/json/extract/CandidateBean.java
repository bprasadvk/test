package com.home.json.extract;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.util.Date;

import javax.json.JsonObjectBuilder;

public class CandidateBean {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The candidate id. */
    private BigDecimal candidateId;

    /** The candidate ref. */
    private String candidateRef;

    /** The environment. */
    private String environment;

    /** The root cause. */
    private String rootCause;

    /** The posturl. */
    private String posturl;

    /** The dtc. */
    private String dtc;

    /** The comments. */
    private String comments;

    /** The complexity. */
    private String complexity;

    /** The date of creation. */
    private Date dateOfCreation;

    /** The who created. */
    private String whoCreated;

    /** The when created. */
    private Date whenCreated;

    /** The who updated. */
    private String whoUpdated;

    /** The when updated. */
    private Date whenUpdated;

    /** The assignee. */
    private String assignee;

    /** The status. */
    private String status;

    /** The function group. */
    private String functionGroupName;

    /** The solution ref list. */
    private String solutionDescription;

    /** The symptom list. */
    private String problemDescription;

    /** The component ref list. */
    private String components;

    /** The component. */
    //private String component;

    /** The vehicle id. */
    private BigDecimal vehicleId;

    /** The ident char set id. */
    private BigInteger identCharSetId;

    /** The make. */
    private String make;

    /** The model. */
    private String model;

    /** The combustion air supply. */
    private String combustionAirSupply;

    /** The body type. */
    private String bodyType;

    /** The cylinders. */
    private String cylinders;

    /** The displacement. */
    private String displacement;

    /** The drive type. */
    private String driveType;

    /** The engine block design. */
    private String engineBlockDesign;

    /** The engine code. */
    private String engineCode;

    /** The engine power. */
    private String enginePower;

    /** The engine type. */
    private String engineType;

    /** The fuel mixture generation. */
    private String fuelMixtureGeneration;

    /** The fuel type. */
    private String fuelType;

    /** The manufacturer internal series. */
    private String series;

    /** The vehicle type. */
    private String vehicleType;

    /**  Start and End. */
    private String yearOfManufacturer;

    /** The year of manufacturer start. */
    private String yearOfManufacturerStart;

    /** The year of manufacturer end. */
    private String yearOfManufacturerEnd;

    /** The country of manufacturer. */
    private String countryOfManufacturer;

    /** The similarity index. */
    private String similarityIndex;

    /**  Other entities. */
    private String otherEntities;

    /** imsis Id Code **/
    private String imsisIdCode;

    /**
     * Instantiates a new candidate bean.
     */
    public CandidateBean() {
    }

    /**
     * Instantiates a new candidate bean.
     *
     * @param candidateId
     *            the candidate id
     */
    public CandidateBean(BigDecimal candidateId) {
        this.candidateId = candidateId;
    }

    /**
     * Gets the candidate id.
     *
     * @return the candidate id
     */
    public BigDecimal getCandidateId() {
        return candidateId;
    }

    /**
     * Sets the candidate id.
     *
     * @param candidateId
     *            the new candidate id
     */
    public void setCandidateId(BigDecimal candidateId) {
        this.candidateId = candidateId;
    }

    /**
     * Gets the candidate ref.
     *
     * @return the candidate ref
     */
    public String getCandidateRef() {
        return candidateRef;
    }

    /**
     * Sets the candidate ref.
     *
     * @param candidateRef
     *            the new candidate ref
     */
    public void setCandidateRef(String candidateRef) {
        this.candidateRef = candidateRef;
    }

    /**
     * Gets the environment.
     *
     * @return the environment
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * Sets the environment.
     *
     * @param environment
     *            the new environment
     */
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    /**
     * Gets the root cause.
     *
     * @return the root cause
     */
    public String getRootCause() {
        return rootCause;
    }

    /**
     * Sets the root cause.
     *
     * @param rootCause
     *            the new root cause
     */
    public void setRootCause(String rootCause) {
        this.rootCause = rootCause;
    }

    /**
     * Gets the posturl.
     *
     * @return the posturl
     */
    public String getPosturl() {
        return posturl;
    }

    /**
     * Sets the posturl.
     *
     * @param posturl
     *            the new posturl
     */
    public void setPosturl(String posturl) {
        this.posturl = posturl;
    }

    /**
     * Gets the dtc.
     *
     * @return the dtc
     */
    public String getDtc() {
        return dtc;
    }

    /**
     * Sets the dtc.
     *
     * @param dtc
     *            the new dtc
     */
    public void setDtc(String dtc) {
        this.dtc = dtc;
    }

    /**
     * Gets the comments.
     *
     * @return the comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the comments.
     *
     * @param comments
     *            the new comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * Gets the components.
     *
     * @return the components
     */
    public String getComponents() {
        return components;
    }

    /**
     * Sets the components.
     *
     * @param components the new components
     */
    public void setComponents(String components) {
        this.components = components;
    }

    /**
     * Gets the complexity.
     *
     * @return the complexity
     */
    public String getComplexity() {
        return complexity;
    }

    /**
     * Sets the complexity.
     *
     * @param complexity
     *            the new complexity
     */
    public void setComplexity(String complexity) {
        this.complexity = complexity;
    }

    /**
     * Gets the date of creation.
     *
     * @return the date of creation
     */
    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    /**
     * Sets the date of creation.
     *
     * @param dateOfCreation
     *            the new date of creation
     */
    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    /**
     * Gets the who created.
     *
     * @return the who created
     */
    public String getWhoCreated() {
        return whoCreated;
    }

    /**
     * Sets the who created.
     *
     * @param whoCreated
     *            the new who created
     */
    public void setWhoCreated(String whoCreated) {
        this.whoCreated = whoCreated;
    }

    /**
     * Gets the when created.
     *
     * @return the when created
     */
    public Date getWhenCreated() {
        return whenCreated;
    }

    /**
     * Sets the when created.
     *
     * @param whenCreated
     *            the new when created
     */
    public void setWhenCreated(Date whenCreated) {
        this.whenCreated = whenCreated;
    }

    /**
     * Gets the who updated.
     *
     * @return the who updated
     */
    public String getWhoUpdated() {
        return whoUpdated;
    }

    /**
     * Sets the who updated.
     *
     * @param whoUpdated
     *            the new who updated
     */
    public void setWhoUpdated(String whoUpdated) {
        this.whoUpdated = whoUpdated;
    }

    /**
     * Gets the when updated.
     *
     * @return the when updated
     */
    public Date getWhenUpdated() {
        return whenUpdated;
    }

    /**
     * Sets the when updated.
     *
     * @param whenUpdated
     *            the new when updated
     */
    public void setWhenUpdated(Date whenUpdated) {
        this.whenUpdated = whenUpdated;
    }

    /**
     * Gets the assignee.
     *
     * @return the assignee
     */
    public String getAssignee() {
        return assignee;
    }

    /**
     * Sets the assignee.
     *
     * @param assignee
     *            the new assignee
     */
    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    /**
     * Gets the status.
     *
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status.
     *
     * @param statusId
     *            the new status
     */
    public void setStatus(String statusId) {
        this.status = statusId;
    }

    /**
     * Gets the vehicle id.
     *
     * @return the vehicle id
     */
    public BigDecimal getVehicleId() {
        return vehicleId;
    }

    /**
     * Sets the vehicle id.
     *
     * @param vehicleId
     *            the new vehicle id
     */
    public void setVehicleId(BigDecimal vehicleId) {
        this.vehicleId = vehicleId;
    }

    /**
     * Gets the ident char set id.
     *
     * @return the ident char set id
     */
    public BigInteger getIdentCharSetId() {
        return identCharSetId;
    }

    /**
     * Sets the ident char set id.
     *
     * @param identCharSetId
     *            the new ident char set id
     */
    public void setIdentCharSetId(BigInteger identCharSetId) {
        this.identCharSetId = identCharSetId;
    }

    /**
     * Gets the make.
     *
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * Sets the make.
     *
     * @param make
     *            the new make
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the model.
     *
     * @param model
     *            the new model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Gets the combustion air supply.
     *
     * @return the combustion air supply
     */
    public String getCombustionAirSupply() {
        return combustionAirSupply;
    }

    /**
     * Sets the combustion air supply.
     *
     * @param combustionAirSupply
     *            the new combustion air supply
     */
    public void setCombustionAirSupply(String combustionAirSupply) {
        this.combustionAirSupply = combustionAirSupply;
    }

    /**
     * Gets the body type.
     *
     * @return the body type
     */
    public String getBodyType() {
        return bodyType;
    }

    /**
     * Sets the body type.
     *
     * @param bodyType
     *            the new body type
     */
    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    /**
     * Gets the cylinders.
     *
     * @return the cylinders
     */
    public String getCylinders() {
        return cylinders;
    }

    /**
     * Sets the cylinders.
     *
     * @param cylinders
     *            the new cylinders
     */
    public void setCylinders(String cylinders) {
        this.cylinders = cylinders;
    }

    /**
     * Gets the displacement.
     *
     * @return the displacement
     */
    public String getDisplacement() {
        return displacement;
    }

    /**
     * Sets the displacement.
     *
     * @param displacement
     *            the new displacement
     */
    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    /**
     * Gets the drive type.
     *
     * @return the drive type
     */
    public String getDriveType() {
        return driveType;
    }

    /**
     * Sets the drive type.
     *
     * @param driveType
     *            the new drive type
     */
    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    /**
     * Gets the engine block design.
     *
     * @return the engine block design
     */
    public String getEngineBlockDesign() {
        return engineBlockDesign;
    }

    /**
     * Sets the engine block design.
     *
     * @param engineBlockDesign
     *            the new engine block design
     */
    public void setEngineBlockDesign(String engineBlockDesign) {
        this.engineBlockDesign = engineBlockDesign;
    }

    /**
     * Gets the engine code.
     *
     * @return the engine code
     */
    public String getEngineCode() {
        return engineCode;
    }

    /**
     * Sets the engine code.
     *
     * @param engineCode
     *            the new engine code
     */
    public void setEngineCode(String engineCode) {
        this.engineCode = engineCode;
    }

    /**
     * Gets the engine power.
     *
     * @return the engine power
     */
    public String getEnginePower() {
        return enginePower;
    }

    /**
     * Sets the engine power.
     *
     * @param enginePower
     *            the new engine power
     */
    public void setEnginePower(String enginePower) {
        this.enginePower = enginePower;
    }

    /**
     * Gets the engine type.
     *
     * @return the engine type
     */
    public String getEngineType() {
        return engineType;
    }

    /**
     * Sets the engine type.
     *
     * @param engineType
     *            the new engine type
     */
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    /**
     * Gets the fuel mixture generation.
     *
     * @return the fuel mixture generation
     */
    public String getFuelMixtureGeneration() {
        return fuelMixtureGeneration;
    }

    /**
     * Sets the fuel mixture generation.
     *
     * @param fuelMixtureGeneration
     *            the new fuel mixture generation
     */
    public void setFuelMixtureGeneration(String fuelMixtureGeneration) {
        this.fuelMixtureGeneration = fuelMixtureGeneration;
    }

    /**
     * Gets the fuel type.
     *
     * @return the fuel type
     */
    public String getFuelType() {
        return fuelType;
    }

    /**
     * Sets the fuel type.
     *
     * @param fuelType
     *            the new fuel type
     */
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    /**
     * Gets the vehicle type.
     *
     * @return the vehicle type
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * Sets the vehicle type.
     *
     * @param vehicleType
     *            the new vehicle type
     */
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    /**
     * Gets the year of manufacturer start.
     *
     * @return the year of manufacturer start
     */
    public String getYearOfManufacturerStart() {
        return yearOfManufacturerStart;
    }

    /**
     * Sets the year of manufacturer start.
     *
     * @param yearOfManufacturerStart
     *            the new year of manufacturer start
     */
    public void setYearOfManufacturerStart(String yearOfManufacturerStart) {
        this.yearOfManufacturerStart = yearOfManufacturerStart;
    }

    /**
     * Gets the year of manufacturer end.
     *
     * @return the year of manufacturer end
     */
    public String getYearOfManufacturerEnd() {
        return yearOfManufacturerEnd;
    }

    /**
     * Sets the year of manufacturer end.
     *
     * @param yearOfManufacturerEnd
     *            the new year of manufacturer end
     */
    public void setYearOfManufacturerEnd(String yearOfManufacturerEnd) {
        this.yearOfManufacturerEnd = yearOfManufacturerEnd;
    }

    /**
     * Gets the country of manufacturer.
     *
     * @return the country of manufacturer
     */
    public String getCountryOfManufacturer() {
        return countryOfManufacturer;
    }

    /**
     * Sets the country of manufacturer.
     *
     * @param countryOfManufacturer
     *            the new country of manufacturer
     */
    public void setCountryOfManufacturer(String countryOfManufacturer) {
        this.countryOfManufacturer = countryOfManufacturer;
    }

    /**
     * Gets the similarity index.
     *
     * @return the similarity index
     */
    public String getSimilarityIndex() {
        return similarityIndex;
    }

    /**
     * Sets the similarity index.
     *
     * @param similarityIndex the new similarity index
     */
    public void setSimilarityIndex(String similarityIndex) {
        this.similarityIndex = similarityIndex;
    }

    /**
     * Gets the function group name.
     *
     * @return the function group name
     */
    public String getFunctionGroupName() {
        return functionGroupName;
    }

    /**
     * Sets the function group name.
     *
     * @param functionGroupName the new function group name
     */
    public void setFunctionGroupName(String functionGroupName) {
        this.functionGroupName = functionGroupName;
    }

    /**
     * Gets the problem description.
     *
     * @return the problem description
     */
    public String getProblemDescription() {
        return problemDescription;
    }

    /**
     * Sets the problem description.
     *
     * @param problemDescription the new problem description
     */
    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    /**
     * Gets the solution description.
     *
     * @return the solution description
     */
    public String getSolutionDescription() {
        return solutionDescription;
    }

    /**
     * Sets the solution description.
     *
     * @param solutionDescription the new solution description
     */
    public void setSolutionDescription(String solutionDescription) {
        this.solutionDescription = solutionDescription;
    }

    /**
     * Gets the series.
     *
     * @return the series
     */
    public String getSeries() {
        return series;
    }

    /**
     * Sets the series.
     *
     * @param series the new series
     */
    public void setSeries(String series) {
        this.series = series;
    }

    /**
     * Gets the year of manufacturer.
     *
     * @return the year of manufacturer
     */
    public String getYearOfManufacturer() {
        return yearOfManufacturer;
    }

    /**
     * Sets the year of manufacturer.
     *
     * @param yearOfManufacturer the new year of manufacturer
     */
    public void setYearOfManufacturer(String yearOfManufacturer) {
        this.yearOfManufacturer = yearOfManufacturer;
    }

    /**
     * Gets the other entities.
     *
     * @return the other entities
     */
    public String getOtherEntities() {
        return otherEntities;
    }

    /**
     * Sets the other entities.
     *
     * @param otherEntities the new other entities
     */
    public void setOtherEntities(String otherEntities) {
        this.otherEntities = otherEntities;
    }

    public String getImsisIdCode() {
        return imsisIdCode;
    }

    public void setImsisIdCode(String imsisIdCode) {
        this.imsisIdCode = imsisIdCode;
    }

    /**
     * Hash code.
     *
     * @author CSA2KOR
     * @return the int
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (candidateId != null ? candidateId.hashCode() : 0);
        return hash;
    }

    /**
     * Equals.
     *
     * @author CSA2KOR
     * @param object
     *            the object
     * @return true, if successful
     */
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are
        // not set
        if (!(object instanceof CandidateBean)) {
            return false;
        }
        CandidateBean other = (CandidateBean) object;
        if ((this.candidateId == null && other.candidateId != null)
                || (this.candidateId != null && !this.candidateId.equals(other.candidateId))) {
            return false;
        }
        return true;
    }

    /**
     * To string.
     *
     * @author CSA2KOR
     * @return the string
     */
    @Override
    public String toString() {
        return "com.bosch.ebr.application.constants.CandidateBean[ candidateId=" + candidateId + " ]";
    }

    /**
     * Adds the json.
     *
     * @author CSA2KOR
     * @param builder
     *            the builder
     */
    public void addJson(JsonObjectBuilder builder) {
        builder.add("candidateId", candidateRef);
        builder.add("id", candidateId);
        if (dateOfCreation != null) {
            builder.add("candidateGenerationDate", DateFormat.getDateInstance().format(dateOfCreation));
        }
        if (functionGroupName != null) {
            builder.add("functionGroup", functionGroupName);
        }
        if (whoUpdated != null) {
            builder.add("updatedBy", whoUpdated);
        }
        if (comments != null) {
            builder.add("comments", comments);
        }
        // TODO to implement component
        if (components != null) {
            builder.add("component", components);
        }
        // builder.add("component", "Antenna motor");
        if (otherEntities != null) {
            builder.add("otherEntities", otherEntities);
        }

        // TODO to implement similarity undex
        builder.add("similarityIndex", similarityIndex + "%");

        if (environment != null) {
            builder.add("environment", environment);
        }
        if (dtc != null) {
            builder.add("dtc", dtc);
        }
        if (problemDescription != null) {
            builder.add("problemDescription", problemDescription);
        }
        if (solutionDescription != null) {
            builder.add("solutionDescription", solutionDescription);
        }

        if (status != null) {
            builder.add("status", status);
        }
        if (complexity != null) {
            builder.add("complexity", complexity);
        }
        if (vehicleId != null) {
            builder.add("vehicleId", vehicleId);
        }
        if (identCharSetId != null) {
            builder.add("identCharSetId", identCharSetId);
        }

        if (combustionAirSupply != null) {
            builder.add("combustionAirSupply", combustionAirSupply);
        }
        if (series != null) {
            builder.add("series", series);
        }
        if (bodyType != null) {
            builder.add("bodyType", bodyType);
        }
        if (cylinders != null) {
            builder.add("cylinders", cylinders);
        }
        if (displacement != null) {
            builder.add("displacement", displacement);
        }
        if (driveType != null) {
            builder.add("driveType", driveType);
        }
        if (engineBlockDesign != null) {
            builder.add("engineBlockDesign", engineBlockDesign);
        }
        if (engineCode != null) {
            builder.add("engineCode", engineCode);
        }
        if (enginePower != null) {
            builder.add("enginePower", enginePower);
        }
        if (engineType != null) {
            builder.add("engineType", engineType);
        }
        if (fuelMixtureGeneration != null) {
            builder.add("fuelMixtureGeneration", fuelMixtureGeneration);
        }
        if (fuelType != null) {
            builder.add("fuelType", fuelType);
        }
        if (countryOfManufacturer != null) {
            builder.add("countryOfManufacture", countryOfManufacturer);
        }
        if (vehicleType != null) {
            builder.add("vehicleType", vehicleType);
        }
        if (yearOfManufacturer != null) {
            builder.add("yearOfManufacturer", yearOfManufacturer);
        }
        if (assignee != null) {
            builder.add("assignee", assignee);
        }
        if (candidateRef != null) {
            builder.add("candidateRef", candidateRef);
        }
        if (imsisIdCode != null) {
            builder.add("imsisIdCode", imsisIdCode);
        }
    }
}
