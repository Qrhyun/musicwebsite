

---

# 歌曲管理模块

## 模块概述
本模块提供对歌曲数据的增删改查（CRUD）操作，包括获取所有歌曲、根据 ID 查询歌曲、创建新歌曲、更新歌曲信息以及删除歌曲。接口遵循 RESTful 风格，确保资源的表述清晰且操作方式一致。

---

## 接口列表

### 1. 获取所有歌曲
- **URL**: `/songs`
- **方法**: `GET`
- **功能**: 获取所有歌曲的列表。
- **返回值**: `List<Song>`，包含所有歌曲的详细信息。
- **请求示例**:
  ```http
  GET /songs
  ```
- **返回示例**:
  ```json
  [
      {
          "id": 1,
          "title": "Song Title 1",
          "artist": "Artist Name",
          "album": "Album Name",
          "duration": 240,
          "filePath": "/path/to/song1.mp3",
          "coverPath": "/path/to/cover1.jpg",
          "lyrics": "Lyrics content...",
          "genre": "Pop",
          "createTime": "2024-06-11T12:00:00",
          "updateTime": "2024-06-11T12:00:00"
      },
      {
          "id": 2,
          "title": "Song Title 2",
          "artist": "Another Artist",
          "album": "Another Album",
          "duration": 300,
          "filePath": "/path/to/song2.mp3",
          "coverPath": "/path/to/cover2.jpg",
          "lyrics": "Another lyrics content...",
          "genre": "Rock",
          "createTime": "2024-06-12T12:00:00",
          "updateTime": "2024-06-12T12:00:00"
      }
  ]
  ```

### 2. 根据 ID 查询歌曲
- **URL**: `/songs/{id}`
- **方法**: `GET`
- **功能**: 根据歌曲 ID 查询单条歌曲信息。
- **参数**:
    - `id` (路径参数): 歌曲的唯一标识。
- **返回值**: `Song`，包含指定 ID 的歌曲详细信息。
- **请求示例**:
  ```http
  GET /songs/1
  ```
- **返回示例**:
  ```json
  {
      "id": 1,
      "title": "Song Title 1",
      "artist": "Artist Name",
      "album": "Album Name",
      "duration": 240,
      "filePath": "/path/to/song1.mp3",
      "coverPath": "/path/to/cover1.jpg",
      "lyrics": "Lyrics content...",
      "genre": "Pop",
      "createTime": "2024-06-11T12:00:00",
      "updateTime": "2024-06-11T12:00:00"
  }
  ```

### 3. 创建新歌曲
- **URL**: `/songs`
- **方法**: `POST`
- **功能**: 创建一条新的歌曲记录。
- **请求体**: `Song` 对象，包含歌曲的详细信息。
- **返回值**: 创建成功的歌曲对象。
- **请求示例**:
  ```http
  POST /songs
  Content-Type: application/json
  ```
  ```json
  {
      "title": "New Song Title",
      "artist": "New Artist",
      "album": "New Album",
      "duration": 200,
      "filePath": "/path/to/new_song.mp3",
      "coverPath": "/path/to/new_cover.jpg",
      "lyrics": "New lyrics content...",
      "genre": "Jazz"
  }
  ```
- **返回示例**:
  ```json
  {
      "id": 3,
      "title": "New Song Title",
      "artist": "New Artist",
      "album": "New Album",
      "duration": 200,
      "filePath": "/path/to/new_song.mp3",
      "coverPath": "/path/to/new_cover.jpg",
      "lyrics": "New lyrics content...",
      "genre": "Jazz",
      "createTime": "2024-06-13T12:00:00",
      "updateTime": "2024-06-13T12:00:00"
  }
  ```

### 4. 更新歌曲信息
- **URL**: `/songs/{id}`
- **方法**: `PUT`
- **功能**: 根据歌曲 ID 更新歌曲信息。
- **参数**:
    - `id` (路径参数): 歌曲的唯一标识。
- **请求体**: `Song` 对象，包含需要更新的歌曲信息。
- **返回值**: 更新后的歌曲对象。
- **请求示例**:
  ```http
  PUT /songs/1
  Content-Type: application/json
  ```
  ```json
  {
      "title": "Updated Song Title",
      "artist": "Updated Artist",
      "album": "Updated Album",
      "duration": 250,
      "filePath": "/path/to/updated_song.mp3",
      "coverPath": "/path/to/updated_cover.jpg",
      "lyrics": "Updated lyrics content...",
      "genre": "Updated Genre"
  }
  ```
- **返回示例**:
  ```json
  {
      "id": 1,
      "title": "Updated Song Title",
      "artist": "Updated Artist",
      "album": "Updated Album",
      "duration": 250,
      "filePath": "/path/to/updated_song.mp3",
      "coverPath": "/path/to/updated_cover.jpg",
      "lyrics": "Updated lyrics content...",
      "genre": "Updated Genre",
      "createTime": "2024-06-11T12:00:00",
      "updateTime": "2024-06-14T12:00:00"
  }
  ```

### 5. 删除歌曲
- **URL**: `/songs/{id}`
- **方法**: `DELETE`
- **功能**: 根据歌曲 ID 删除歌曲。
- **参数**:
    - `id` (路径参数): 歌曲的唯一标识。
- **返回值**: 无返回值（`void`）。
- **请求示例**:
  ```http
  DELETE /songs/1
  ```
- **返回示例**:
  ```http
  HTTP/1.1 204 No Content
  ```

---

## 数据模型：Song
| 字段          | 类型        | 描述                     |
|---------------|-------------|--------------------------|
| `id`          | Long        | 歌曲的唯一标识（主键）   |
| `title`       | String      | 歌曲标题                 |
| `artist`      | String      | 歌手名称                 |
| `album`       | String      | 所属专辑                 |
| `duration`    | Integer     | 歌曲时长（单位：秒）     |
| `filePath`    | String      | 歌曲文件路径             |
| `coverPath`   | String      | 歌曲封面路径             |
| `lyrics`      | String      | 歌词内容                 |
| `genre`       | String      | 音乐类型（如流行、摇滚等）|
| `createTime`  | LocalDateTime| 创建时间                 |
| `updateTime`  | LocalDateTime| 更新时间                 |

---

## 注意事项
1. **错误处理**：
    - 如果请求的歌曲 ID 不存在，返回 `404 Not Found`。
    - 如果请求体格式不正确，返回 `400 Bad Request`。
    - 如果操作成功，返回相应的 HTTP 状态码（如 `200 OK`、`204 No Content`）。

2. **认证与授权**：
    - 需要确保对歌曲的增删改操作有相应的权限。

3. **数据校验**：
    - 创建或更新歌曲时，需要对请求体中的数据进行校验，确保数据的完整性和合法性。

---

希望这份文档能帮助前端团队更好地理解和使用这些接口！如果还有其他需求或需要补充内容，欢迎随时告诉我。