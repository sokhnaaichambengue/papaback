package isepddiamniadio.pff.Gestion_performance.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EvaluationnPerformanceAi {

    @Id
    private String indicateurPerformance;
    private String description;
    private String objectifAi;
    private String normeAgentAi;
    @ManyToOne
    private AgentAi agentAi;

}