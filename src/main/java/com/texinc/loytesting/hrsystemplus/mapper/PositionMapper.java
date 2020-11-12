package com.texinc.loytesting.hrsystemplus.mapper;

import com.texinc.loytesting.hrsystemplus.bean.Position;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author i@loyio.me
 * @date 2020/11/12 7:05 PM
 */
@Mapper
public interface PositionMapper {
    int addPos(@Param("pos") Position pos);

    Position getPosByName(String name);

    List<Position> getAllPos();

    int deletePosById(@Param("pids") String[] pids);

    int updatePosById(@Param("pos") Position position);
}
