//package com.busanit501.springproject3.lhj.service;
//
//import com.busanit501.springproject3.lhj.domain.Tool;
//import com.busanit501.springproject3.lhj.dto.ToolDTO;
//import com.busanit501.springproject3.lhj.repository.ToolRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//public class ToolServiceImpl implements ToolService {
//
//    private final ToolRepository toolRepository;
//
//    @Autowired
//    public ToolServiceImpl(ToolRepository toolRepository) {
//        this.toolRepository = toolRepository;
//    }
//
//    @Override
//    public ToolDTO getToolById(String id) {
//        Tool tool = toolRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("Tool not found"));
//        return convertToDTO(tool);
//    }
//
//    @Override
//    public ToolDTO createTool(ToolDTO toolDTO) {
//        Tool tool = convertToEntity(toolDTO);
//        Tool savedTool = toolRepository.save(tool);
//        return convertToDTO(savedTool);
//    }
//
//    @Override
//    public ToolDTO updateTool(String id, ToolDTO toolDTO) {
//        Tool existingTool = toolRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("Tool not found"));
//        existingTool.setToolName(toolDTO.getToolName());
//        existingTool.setDescription(toolDTO.getDescription());
//        existingTool.setImages(toolDTO.getImages());
//        existingTool.setImgText(toolDTO.getImgText());
//        existingTool.setMetadata(toolDTO.getMetadata());
//        Tool updatedTool = toolRepository.save(existingTool);
//        return convertToDTO(updatedTool);
//    }
//
//    @Override
//    public void deleteTool(String id) {
//        Tool tool = toolRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("Tool not found"));
//        toolRepository.delete(tool);
//    }
//
//    @Override
//    public List<ToolDTO> getAllTools() {
//        return toolRepository.findAll().stream()
//                .map(this::convertToDTO)
//                .collect(Collectors.toList());
//    }
//
//    private ToolDTO convertToDTO(Tool tool) {
//        ToolDTO toolDTO = new ToolDTO();
//        toolDTO.setId(tool.getId());
//        toolDTO.setToolName(tool.getToolName());
//        toolDTO.setDescription(tool.getDescription());
//        toolDTO.setImages(tool.getImages());
//        toolDTO.setImgText(tool.getImgText());
//        toolDTO.setMetadata(tool.getMetadata());
//        return toolDTO;
//    }
//
//    private Tool convertToEntity(ToolDTO toolDTO) {
//        Tool tool = new Tool();
//        tool.setToolName(toolDTO.getToolName());
//        tool.setDescription(toolDTO.getDescription());
//        tool.setImages(toolDTO.getImages());
//        tool.setImgText(toolDTO.getImgText());
//        tool.setMetadata(toolDTO.getMetadata());
//        return tool;
//    }
//}