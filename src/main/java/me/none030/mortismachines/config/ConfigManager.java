package me.none030.mortismachines.config;

import me.none030.mortismachines.machines.MachineManager;

public class ConfigManager {

    private final MachineManager manager;
    private final ItemConfig itemConfig;
    private final RecipeConfig recipeConfig;
    private final StructureConfig structureConfig;
    private final SoundConfig soundConfig;
    private final TimerConfig timerConfig;
    private final RemoteControlConfig remoteControlConfig;
    private final IdCardConfig idCardConfig;
    private final AutoCrafterConfig autoCrafterConfig;

    public ConfigManager(MachineManager manager) {
        this.manager = manager;
        itemConfig = new ItemConfig(this);
        recipeConfig = new RecipeConfig(this);
        structureConfig = new StructureConfig(this);
        soundConfig = new SoundConfig(this);
        timerConfig = new TimerConfig(this);
        remoteControlConfig = new RemoteControlConfig(this);
        idCardConfig = new IdCardConfig(this);
        autoCrafterConfig = new AutoCrafterConfig(this);
    }

    public MachineManager getManager() {
        return manager;
    }

    public ItemConfig getItemConfig() {
        return itemConfig;
    }

    public RecipeConfig getRecipeConfig() {
        return recipeConfig;
    }

    public StructureConfig getStructureConfig() {
        return structureConfig;
    }

    public SoundConfig getSoundConfig() {
        return soundConfig;
    }

    public TimerConfig getTimerConfig() {
        return timerConfig;
    }

    public RemoteControlConfig getRemoteControlConfig() {
        return remoteControlConfig;
    }

    public IdCardConfig getIdCardConfig() {
        return idCardConfig;
    }

    public AutoCrafterConfig getAutoCrafterConfig() {
        return autoCrafterConfig;
    }
}
