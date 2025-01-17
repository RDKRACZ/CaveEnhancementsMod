package com.exdrill.ce.client.render.entity;

import com.exdrill.ce.CaveEnhancements;
import com.exdrill.ce.client.render.entity.model.GoopEntityModel;
import com.exdrill.ce.entity.GoopEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class GoopEntityRenderer extends MobEntityRenderer<GoopEntity, GoopEntityModel<GoopEntity>> {
    public GoopEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new GoopEntityModel<>(context.getPart(GoopEntityModel.ENTITY_MODEL_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(GoopEntity entity) {
        return new Identifier(CaveEnhancements.NAMESPACE, "textures/entity/goop.png");
    }
}