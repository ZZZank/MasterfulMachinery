package com.ticticboooom.mods.mm.model;

import com.ticticboooom.mods.mm.data.MachineProcessRecipe;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.util.ResourceLocation;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ProcessUpdate {
    private int ticksTaken;
    private String msg = "";
    private MachineProcessRecipe recipe;
    private WorldStructureDefinition structureDefinition = new WorldStructureDefinition();
    private List<Integer> takenIndices = new ArrayList<>();
}
